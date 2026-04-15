package com.anaptecs.jeaf.generator.annotations;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

/**
 * Annotation can be used to add example values to properties etc.
 *
 * @author JEAF Development Team
 */
@Documented
@Retention(RUNTIME)
public @interface Example {
  /**
   * Example values for an element.
   */
  String[] value() default {};
}
