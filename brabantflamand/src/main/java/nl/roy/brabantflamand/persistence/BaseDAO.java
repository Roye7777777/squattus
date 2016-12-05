package nl.roy.brabantflamand.persistence;

import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.dao.BasicDAO;


import nl.roy.brabantflamand.model.EntityModel;

public abstract class BaseDAO< T extends EntityModel > extends BasicDAO< T, ObjectId >
{

	public BaseDAO( Class < T> entityClass, Datastore ds )
	{
		super(entityClass, ds);
	}
	
	public T get( String id)
	{
		return get( new ObjectId( id ) );
	}
	
	public List< T > getAll()
	{
		return find().asList();
	}

}
