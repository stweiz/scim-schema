package org.osiam.resources.type;

public interface GenericType<E> {
	E fromString(String type);
}