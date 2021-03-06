/*
 	Copyright (c) 2019 Oracle and/or its affiliates. All rights reserved.
	
	This program and the accompanying materials are made available under the
	terms of the Eclipse Public License v. 2.0, which is available at
	http://www.eclipse.org/legal/epl-2.0.
	
	This Source Code may also be made available under the following Secondary
	Licenses when the conditions for such availability set forth in the
	Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
	version 2 with the GNU Classpath Exception, which is available at
	https://www.gnu.org/software/classpath/license.html.
	
	SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
*/

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.glassfish.servlet.annotation_war;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Web application lifecycle listener.
 *
 * @author Shing Wai Chan
 *
 */
@WebListener()
public class TestServletContextListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent sce) {
        ServletContext context = sce.getServletContext();
        String msg = "my listener";
        context.setAttribute("listenerMessage", msg);
    }

    public void contextDestroyed(ServletContextEvent sce) {
    }
}
