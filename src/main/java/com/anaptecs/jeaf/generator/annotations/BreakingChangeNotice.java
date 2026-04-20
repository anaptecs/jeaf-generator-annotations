package com.anaptecs.jeaf.generator.annotations;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

/**
 * This annotation allows to add details about upcoming breaking changes to the code.
 *
 * @author JEAF Development Team
 */
@Documented
@Retention(RUNTIME)
public @interface BreakingChangeNotice {
  /**
   * Description of an upcoming breaking change.
   */
  String description() default "";

  /**
   * Information since when a breaking change was announced for an element e.g. a concrete version or date.
   */
  String since() default "";

  /**
   * Version or date when a breaking change becomes active. </br>
   * </br>
   * <strong>Example:</strong>
   * <ul>
   * <li>A new parameter is introduced for a request. To not immediately break the API at first the parameter is
   * optional. Using this field it can be defined when the parameter will be mandatory.</li>
   * </ul>
   */
  String activeWith() default "";

  /**
   * Explicit date when the breaking change will be activated.
   *
   * The expected date format is `yyyy-mm-dd`.
   */
  String activationDate() default "";

}
