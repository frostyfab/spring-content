package internal.org.springframework.content.rest.io;

import org.springframework.content.commons.mappingcontext.ContentProperty;
import org.springframework.core.io.WritableResource;

public interface AssociatedStoreResource<S> extends WritableResource, StoreResource {

    S getAssociation();

    ContentProperty getContentProperty();
}