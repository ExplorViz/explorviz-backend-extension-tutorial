package net.explorviz.extension.tutorial.server.providers;

import org.glassfish.hk2.api.Factory;

import com.github.jasminb.jsonapi.DeserializationFeature;
import com.github.jasminb.jsonapi.ResourceConverter;
import com.github.jasminb.jsonapi.SerializationFeature;

import net.explorviz.extension.tutorial.model.Interactable;
import net.explorviz.extension.tutorial.model.Sequence;
import net.explorviz.extension.tutorial.model.Step;
import net.explorviz.extension.tutorial.model.Tutorial;

/**
 * Factory for creating resource converts for JSON conversion.
 */
public class ResourceConverterFactory implements Factory<ResourceConverter> {
	private final ResourceConverter converter;

	/**
	 * Creates a new factory.
	 */
	public ResourceConverterFactory() {
		final ResourceConverter resourceConverter = new ResourceConverter();

		resourceConverter.registerType(Tutorial.class);
		resourceConverter.registerType(Sequence.class);
		resourceConverter.registerType(Step.class);
		resourceConverter.registerType(Interactable.class);

		this.converter = resourceConverter;
		this.converter.enableSerializationOption(SerializationFeature.INCLUDE_RELATIONSHIP_ATTRIBUTES);

		// Clients send records with no id, therefore allow this feature
		this.converter.disableDeserializationOption(DeserializationFeature.REQUIRE_RESOURCE_ID);
	}

	@Override
	public void dispose(final ResourceConverter arg0) {
		// Nothing to dispose
	}

	@Override
	public ResourceConverter provide() {
		return this.converter;
	}
}