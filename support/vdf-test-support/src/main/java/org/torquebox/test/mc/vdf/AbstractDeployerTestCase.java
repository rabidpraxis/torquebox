/*
 * Copyright 2008-2011 Red Hat, Inc, and individual contributors.
 * 
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 * 
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.torquebox.test.mc.vdf;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.Set;

import org.jboss.logging.Logger;
import org.junit.After;
import org.junit.Before;
import org.torquebox.test.mc.vfs.AbstractVFSTestCase;

public abstract class AbstractDeployerTestCase extends AbstractVFSTestCase {

    protected Logger log;

    public AbstractDeployerTestCase() {
        this.log = Logger.getLogger( getClass() );
    }


    @Before
    public void startServer() throws Exception {
    }

    @After
    public void stopServer() throws Exception {
    }

}