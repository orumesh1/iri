package com.oru.iri.service;

import java.util.Map;

public interface CallableRequest<V> {
    V call(Map<String, Object> request);
}
