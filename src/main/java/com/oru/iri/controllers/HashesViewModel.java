package com.oru.iri.controllers;

import com.oru.iri.model.Hash;
import com.oru.iri.storage.Indexable;
import com.oru.iri.storage.Tangle;

import java.util.*;

/**
 * Created by paul on 5/6/17.
 */
public interface HashesViewModel {
    boolean store(Tangle tangle) throws Exception;
    int size();
    boolean addHash(Hash theHash);
    Indexable getIndex();
    Set<Hash> getHashes();
    void delete(Tangle tangle) throws Exception;

    HashesViewModel next(Tangle tangle) throws Exception;
}
