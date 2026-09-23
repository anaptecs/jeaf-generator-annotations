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
   * Specifies when a breaking change was first announced for an element, for example a specific version or date.
   */
  String since() default "";

  /**
   * Version in which a breaking change becomes effective.</br>
   * </br>
   * <strong>Example:</strong>
   * <ul>
   * <li>A new parameter is introduced for a request. To not immediately break the API at first the parameter is
   * optional. Using this field it can be defined with which version the parameter will be mandatory.</li>
   * </ul>
   * <br/>
   * <strong>UML Model / JEAF Generator:</strong>
   * <ul>
   * <li>Either taken directly from stereotype <code>BreakingChange</code> tagged value <code>activeWith</code> or</li>
   * <li>from first incompatible version if using compatibility groups etc.</li>
   * </ul>
   */
  String activeWith() default "";

  /**
   * The date on which the breaking change becomes effective in production environments.<br/>
   * <br/>
   * A go-live date does not necessarily mean that existing clients will stop working immediately. Depending on the
   * release policy, a transition or compatibility period may be provided (see
   * {@link #endOfCompatibilityPeriod()}).<br/>
   * <br/>
   * The expected date format is <strong><code>yyyy-mm-dd</code></strong>.<br/>
   * <br/>
   * <strong>UML Model / JEAF Generator:</strong>
   * <ul>
   * <li>Either taken directly from stereotype <code>BreakingChange</code> tagged value <code>goLiveDate</code> or</li>
   * <li>from first incompatible version if using compatibility groups etc.</li>
   * </ul>
   */
  String goLiveDate() default "";

  /**
   * The date on which the compatibility period for a breaking change ends in production environments.<br/>
   * <br/>
   * Consumers must have adapted their code by this date to avoid compatibility issues once the compatibility period has
   * ended.<br/>
   * <br/>
   * The expected date format is <strong><code>yyyy-mm-dd</code></strong>. <br/>
   * <br/>
   * <strong>UML Model / JEAF Generator:</strong>
   * <ul>
   * <li>Taken from <code>endOfLifeDate</code> from compatibility info
   * </ul>
   */
  String endOfCompatibilityPeriod() default "";
}
