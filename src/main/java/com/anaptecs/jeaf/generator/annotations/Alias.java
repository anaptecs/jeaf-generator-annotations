package com.anaptecs.jeaf.generator.annotations;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

/**
 * Annotation can be used to add an alias information (alternate names for an element) to the code. This alias is just
 * there for documentation purpose.
 *
 * @author JEAF Development Team
 */
@Documented
@Retention(RUNTIME)
public @interface Alias {
  /**
   * Alternate names for an element.
   */
  String[] alternateNames() default {};
}
