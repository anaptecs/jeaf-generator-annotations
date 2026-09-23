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
public @interface DeprecationNotice {
  /**
   * Description of the deprecation and what might be an alternative that should be used instead.
   */
  String description() default "";

  /**
   * Specifies when a deprecation was first announced for an element, for example a specific version or date.
   */
  String since() default "";

  /**
   * Version in which a deprecation will be removed.<br/>
   * </br>
   * <strong>Example:</strong>
   * <ul>
   * <li>An existing parameter in a request should not be removed. To not immediately break the API at first the
   * parameter is only marked as deprecated. Using this field it can be defined starting from which version the
   * parameter will not be supported any more.</li>
   * </ul>
   * <br/>
   * <strong>UML Model / JEAF Generator:</strong>
   * <ul>
   * <li>Either taken directly from stereotype <code>JEAFDeprecated</code> tagged value <code>removedWith</code> or</li>
   * <li>from first incompatible version if using compatibility groups etc.</li>
   * </ul>
   */
  String removedWith() default "";

  /**
   * The date on which the deprecation becomes effective in production environments.<br/>
   * <br/>
   * A go-live date does not necessarily mean that existing clients will stop working immediately. Depending on the
   * release policy, a transition or compatibility period may be provided (see {@link #endOfCompatibilityPhase()}).<br/>
   * <br/>
   * The expected date format is <strong><code>yyyy-mm-dd</code></strong>. <br/>
   * <br/>
   * <strong>UML Model / JEAF Generator:</strong>
   * <ul>
   * <li>Either taken directly from stereotype <code>JEAFDeprecated</code> tagged value <code>goLiveDate</code> or</li>
   * <li>from first incompatible version if using compatibility groups etc.</li>
   * </ul>
   */
  String goLiveDate() default "";

  /**
   * The date on which the compatibility phase for a deprecation ends in production environments.<br/>
   * <br/>
   * Consumers must have adapted their code by this date to avoid compatibility issues once the compatibility phase has
   * ended.<br/>
   * <br/>
   * The expected date format is <strong><code>yyyy-mm-dd</code></strong>.<br/>
   * <br/>
   * <strong>UML Model / JEAF Generator:</strong>
   * <ul>
   * <li>Taken from <code>endOfLifeDate</code> from compatibility info
   * </ul>
   */
  String endOfCompatibilityPhase() default "";
}
