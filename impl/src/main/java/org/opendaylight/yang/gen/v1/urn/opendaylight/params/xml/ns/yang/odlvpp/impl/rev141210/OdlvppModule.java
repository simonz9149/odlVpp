/*
 * Copyright © 2015 Copyright (c) Opendaylight Vpp, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.odlvpp.impl.rev141210;

import org.opendaylight.simon.odlvpp.impl.OdlvppProvider;

public class OdlvppModule extends org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.odlvpp.impl.rev141210.AbstractOdlvppModule {
    public OdlvppModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        super(identifier, dependencyResolver);
    }

    public OdlvppModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver, org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.odlvpp.impl.rev141210.OdlvppModule oldModule, java.lang.AutoCloseable oldInstance) {
        super(identifier, dependencyResolver, oldModule, oldInstance);
    }

    @Override
    public void customValidation() {
        // add custom validation form module attributes here.
    }

    @Override
    public java.lang.AutoCloseable createInstance() {
        OdlvppProvider provider = new OdlvppProvider();
        getBrokerDependency().registerProvider(provider);
        return provider;
    }

}
