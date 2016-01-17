/**
 * 
 */
package com.designpattern.dependencyinjection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.inject.Qualifier;


/**
 * 
 * @author jassiga
 *
 */


@Retention(RetentionPolicy.RUNTIME)
@Qualifier
@Target(ElementType.FIELD)
public @interface Mongo {

}
