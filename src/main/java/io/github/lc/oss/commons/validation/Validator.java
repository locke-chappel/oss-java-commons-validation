package io.github.lc.oss.commons.validation;

import java.util.Set;

import io.github.lc.oss.commons.serialization.Message;

public interface Validator<Type> {
    Set<Message> validate(Type instance);
}
