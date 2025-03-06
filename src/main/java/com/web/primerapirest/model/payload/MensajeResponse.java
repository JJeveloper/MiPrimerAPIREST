package com.web.primerapirest.model.payload;

import java.io.Serializable;

public class MensajeResponse extends RuntimeException {

    public MensajeResponse(String message) {
        super(message);
    }
}
