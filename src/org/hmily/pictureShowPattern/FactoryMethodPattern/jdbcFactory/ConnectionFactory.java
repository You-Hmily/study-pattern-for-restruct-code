package org.hmily.pictureShowPattern.FactoryMethodPattern.jdbcFactory;

import java.util.Properties;

public interface ConnectionFactory {

    Connection create(Properties info);

}
