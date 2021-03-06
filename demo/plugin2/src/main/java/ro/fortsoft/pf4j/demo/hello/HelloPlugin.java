/*
 * Copyright 2012 Decebal Suiu
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this work except in compliance with
 * the License. You may obtain a copy of the License in the LICENSE file, or at:
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package ro.fortsoft.pf4j.demo.hello;

import ro.fortsoft.pf4j.Extension;
import ro.fortsoft.pf4j.Plugin;
import ro.fortsoft.pf4j.PluginWrapper;
import ro.fortsoft.pf4j.demo.api.Greeting;

/**
 * A very simple plugin.
 *
 * @author Decebal Suiu
 */
public class HelloPlugin extends Plugin {

    public HelloPlugin(PluginWrapper wrapper) {
        super(wrapper);
    }

    public void start() {
        System.out.println("HelloPlugin.start()");
    }

    public void stop() {
        System.out.println("HelloPlugin.stop()");
    }

    @Extension
    public static class HelloGreeting implements Greeting {

        public String getGreeting() {
            return "Hello";
        }

    }

}
