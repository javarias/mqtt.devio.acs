/*******************************************************************************
 * ALMA - Atacama Large Millimeter Array
 * Copyright (c) AUI - Associated Universities Inc., 2011
 * (in the framework of the ALMA collaboration).
 * All rights reserved.
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307  USA
 *******************************************************************************/
package archive.tmcdb.monitoring.TMCOffline;

import java.util.List;
import java.util.Date;

import org.apache.log4j.Logger;

import archive.tmcdb.monitoring.TMCStats.TMCProducerStats;
import archive.tmcdb.monitoring.TMCStats.TMCTimeStatistic;

/**
 * This class is a sync dumper
 *
 * @version 1.1
 * @author pmerino@alma.cl
 */
public class TMCSyncInfluxDumper extends TMCInfluxDumper implements Runnable {
    /** The logger */
    private static final Logger log = Logger.getLogger(TMCSyncInfluxDumper.class);

    /**
     * Constructor
     *
     * @param channelName The channel name
     * @param dataList The data list
     * @param tmcProperties The TMC properties
     * @param writerStats The writer stats
     * @param diskWriteTime The disk write time
     * @param startupDate The startup date
     */
    public TMCSyncInfluxDumper(String channelName, List<String> dataList, TMCProperties tmcProperties, TMCProducerStats writerStats, TMCTimeStatistic diskWriteTime, Date startupDate) {
        super(channelName, dataList, tmcProperties, writerStats, diskWriteTime, startupDate);
    }

    /**
     * Write the data list to text file
     */
    @Override
    public void run() {
        if (log.isInfoEnabled())
            log.info("Cleaning old data of Redis...");
        writeData();
    }
}
