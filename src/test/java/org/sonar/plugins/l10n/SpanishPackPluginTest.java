/*
 * L10n :: Spanish Pack
 * Copyright (C) 2011 excentia
 * dev@sonar.codehaus.org
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */
package org.sonar.plugins.l10n;

import org.junit.Test;
import org.sonar.test.i18n.I18nMatchers;

import static org.fest.assertions.Assertions.assertThat;

public class SpanishPackPluginTest {

  @Test
  public void noExtensions() throws Exception {
    assertThat(new SpanishPackPlugin().getExtensions()).isEmpty();
  }
  
  @Test
  public void bundles_should_be_up_to_date() {
    I18nMatchers.assertBundlesUpToDate();
  }

}
