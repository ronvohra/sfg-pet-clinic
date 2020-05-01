package io.github.ronvohra.sfgpetclinic.services;

import io.github.ronvohra.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
