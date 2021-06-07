/*
 * Copyright (c) 2002-2021, City of Paris
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  1. Redistributions of source code must retain the above copyright notice
 *     and the following disclaimer.
 *
 *  2. Redistributions in binary form must reproduce the above copyright notice
 *     and the following disclaimer in the documentation and/or other materials
 *     provided with the distribution.
 *
 *  3. Neither the name of 'Mairie de Paris' nor 'Lutece' nor the names of its
 *     contributors may be used to endorse or promote products derived from
 *     this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 * License 1.0
 */
package fr.paris.lutece.plugins.workflow.modules.alertgru.service;

import fr.paris.lutece.plugins.workflow.modules.alertgru.business.history.AlertGruHistory;
import fr.paris.lutece.portal.service.plugin.Plugin;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * IAlertGruHistoryService
 *
 */
public interface IAlertGruHistoryService
{
    /**
     * Creation of an instance of Alert GRU
     *
     * @param notifyGru
     *            The instance of comment value which contains the informations to store
     * @param plugin
     *            the plugin
     */
    @Transactional( AlertGruPlugin.BEAN_TRANSACTION_MANAGER )
    void create( AlertGruHistory notifyGru, Plugin plugin );

    /**
     * Remove Alert GRU value by history
     *
     * @param nIdHistory
     *            the history key
     * @param nIdTask
     *            The task key
     * @param plugin
     *            the Plugin
     */
    @Transactional( AlertGruPlugin.BEAN_TRANSACTION_MANAGER )
    void removeByHistory( int nIdHistory, int nIdTask, Plugin plugin );

    /**
     * Remove Alert GRU value by task
     *
     * @param nIdTask
     *            The task key
     * @param plugin
     *            the Plugin
     */
    @Transactional( AlertGruPlugin.BEAN_TRANSACTION_MANAGER )
    void removeByTask( int nIdTask, Plugin plugin );

    /**
     * Load the Alert GRU Object
     *
     * @param nIdHistory
     *            the history id
     * @param nIdTask
     *            the task id
     * @param plugin
     *            the plugin
     * @return the Config Object
     */
    AlertGruHistory findByPrimaryKey( int nIdHistory, int nIdTask, Plugin plugin );
}
