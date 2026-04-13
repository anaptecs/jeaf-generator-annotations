package com.anaptecs.jeaf.generator.annotations;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

/**
 * This deprecation annotation allows to add additional details about deprecations to the code. This annotation is an
 * extension to the existing deprecation annotation {@link Deprecated} that exists in Java by default
 *
 * @author JEAF Development Team
 */
@Documented
@Retention(RUNTIME)
public @interface JEAFDeprecationNotice {
  /**
   * Description of the deprecation and what might be an alternative that should be used instead.
   */
  String description() default "";

  /**
   * Information since when an element is deprecated e.g. a concrete version or date.
   */
  String since() default "";

  /**
   * Information when a deprecated element will no longer be available e.g. a version or date.
   */
  String removedWith() default "";
}
