package net.explorviz.extension.tutorial.services;

import java.util.List;
import java.util.Optional;

import org.jvnet.hk2.annotations.Service;

import com.mongodb.MongoException;

/**
 * Injectable service that manages create, read, update and delete operations for {@link T} objects.
 *
 */
@Service
public interface MongoCrudService<T> {

  /**
   * Persists a new entity object.
   *
   * @param entity - the entity to persist
   * @return optional - found entity
   */
  Optional<T> saveNewEntity(final T entity);

  /**
   * Persists a new uploaded entity object.
   *
   * @param entity - the entity to persist
   * @return optional - found entity
   */
  Optional<T> saveUploadedEntity(final T entity);

  /**
   * Updates values of an existing entity.
   *
   * @param entity - the entity to update
   */
  void updateEntity(final T entity);

  /**
   * Retrieves an entity by its id.
   *
   * @param id - the id of the entity to find
   * @return optional the entity with the given id
   */
  Optional<T> getEntityById(final String id);


  /**
   * Retrieves all entities.
   *
   * @return a list of all known entities
   */
  List<T> getAll();


  /**
   * Deletes an entity.
   *
   * @param id - the id of the entity to delete
   * @throws UserCrudException if the user could not be deleted
   * @throws MongoException
   */
  void deleteEntityById(final String id) throws TutorialCrudException;


  /**
   * Retrieves an entity by a field and its value.
   *
   * @param field - name of the entity
   * @param value - value for the field
   * @return optional - found entity
   */
  Optional<T> findEntityByFieldValue(String field, Object value);


}
