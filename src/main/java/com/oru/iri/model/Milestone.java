package com.oru.iri.model;

import com.oru.iri.storage.Persistable;
import com.oru.iri.utils.Serializer;
import org.apache.commons.lang3.ArrayUtils;

/**
 * Created by paul on 4/11/17.
 */
public class Milestone implements Persistable {
    public IntegerIndex index;
    public Hash hash;

    public byte[] bytes() {
        return ArrayUtils.addAll(index.bytes(), hash.bytes());
    }

    public void read(byte[] bytes) {
        if(bytes != null) {
            index = new IntegerIndex(Serializer.getInteger(bytes));
            hash = new Hash(bytes, Integer.BYTES, Hash.SIZE_IN_BYTES);
        }
    }

    @Override
    public byte[] metadata() {
        return new byte[0];
    }

    @Override
    public void readMetadata(byte[] bytes) {

    }

    @Override
    public boolean merge() {
        return false;
    }
}
