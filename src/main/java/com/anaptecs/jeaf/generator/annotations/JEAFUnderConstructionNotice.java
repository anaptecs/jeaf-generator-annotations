package com.anaptecs.jeaf.generator.annotations;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

/**
 * Annotation is used to mark elements that are still work in progress, meaning that the element is not yet ready or is
 * expected to change soon.
 *
 * In contrast to {@link JEAFDeprecationNotice} and {@link JEAFBreakingChangeNotice}, this annotation is intended as an
 * internal marker, whereas the others are meant to communicate information to external users.
 *
 * @author JEAF Development Team
 */
@Documented
@Retention(RUNTIME)
public @interface JEAFUnderConstructionNotice {
  /**
   * Changes that are planned for an element.
   */
  ChangeType[] plannedChanges() default ChangeType.UNDEFINED;

  /**
   * Detailed description what of the element is under construction and is supposed to be changed in the future.
   */
  String description() default "";
}
