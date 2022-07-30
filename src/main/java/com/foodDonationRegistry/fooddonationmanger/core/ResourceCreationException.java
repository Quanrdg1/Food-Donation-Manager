package com.foodDonationRegistry.fooddonationmanger.core;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT)

public class ResourceCreationException {
    public ResourceCreationException(String message) {
        super();
    }
}
