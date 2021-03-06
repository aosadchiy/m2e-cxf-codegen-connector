/*
 *
 *    Copyright (c) 2011 bitstrings.org - Pino Silvaggio
 *
 *    All rights reserved. This program and the accompanying materials
 *    are made available under the terms of the Eclipse Public License v1.0
 *    which accompanies this distribution, and is available at
 *    http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.talend.esb.m2e.connectors.cxf;

import org.apache.maven.plugin.MojoExecution;
import org.eclipse.m2e.core.lifecyclemapping.model.IPluginExecutionMetadata;
import org.eclipse.m2e.core.project.IMavenProjectFacade;
import org.eclipse.m2e.core.project.configurator.AbstractBuildParticipant;
import org.eclipse.m2e.jdt.AbstractJavaProjectConfigurator;

public class CxfWsdl2JavaProjectConfigurator extends
        AbstractJavaProjectConfigurator {

    @Override
    protected String getOutputFolderParameterName()
    {
        return "sourceRoot";
    }

    @Override
    public AbstractBuildParticipant getBuildParticipant(
                    IMavenProjectFacade projectFacade,
                    MojoExecution execution,
                    IPluginExecutionMetadata executionMetadata)
    {
        return new CxfWsdl2JavaBuildParticipant(execution);
    }
}
