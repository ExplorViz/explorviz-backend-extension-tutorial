package net.explorviz.extension.tutorial.model;

import com.github.jasminb.jsonapi.LongIdHandler;
import com.github.jasminb.jsonapi.annotations.Type;

import xyz.morphia.annotations.Entity;
import xyz.morphia.annotations.Id;
import xyz.morphia.annotations.IndexOptions;
import xyz.morphia.annotations.Indexed;

@Type("step")
@Entity("step")
public class Step {

	@Id
	@com.github.jasminb.jsonapi.annotations.Id
	private String id;

	@Indexed(options = @IndexOptions(unique = true))
	private String title;
	
	private String text;

	private String action;

	private String targetType;

	private String targetId;

	public String getId() {
		return id;
	}

	public void setId(final String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	public String getAction() {
		return action;
	}

	public void setAction(final String action) {
		this.action = action;
	}

	public String getText() {
		return text;
	}

	public void setText(final String text) {
		this.text = text;
	}

	public String getTargetType() {
		return targetType;
	}

	public void setTargetType(final String targetType) {
		this.targetType = targetType;
	}

	public String getTargetId() {
		return targetId;
	}

	public void setTargetId(final String targetId) {
		this.targetId = targetId;
	}
	

}
