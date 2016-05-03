/* ============================================================================
 * INTEL CONFIDENTIAL
 *
 * Copyright 2016 Intel Corporation All Rights Reserved.
 *
 * The source code contained or described herein and all documents related to
 * the source code ("Material") are owned by Intel Corporation or its suppliers
 * or licensors. Title to the Material remains with Intel Corporation or its
 * suppliers and licensors. The Material contains trade secrets and proprietary
 * and confidential information of Intel or its suppliers and licensors. The
 * Material is protected by worldwide copyright and trade secret laws and
 * treaty provisions. No part of the Material may be used, copied, reproduced,
 * modified, published, uploaded, posted, transmitted, distributed, or
 * disclosed in any way without Intel's prior express written permission.
 *
 * No license under any patent, copyright, trade secret or other intellectual
 * property right is granted to or conferred upon you by disclosure or delivery
 * of the Materials, either expressly, by implication, inducement, estoppel or
 * otherwise. Any license under such intellectual property rights must be
 * express and approved by Intel in writing.
 * ============================================================================
 */
package com.intel.tools.fdk.graphframework.graph;

/**
 * Represent a graph Link (i.e Edge).</br>
 *
 * A link connects a node to another node (or itself).</br>
 * The link does not carry the information of which inputs/outputs are connected.
 *
 * This interface is not intended to be implemented by clients.
 */
public interface ILink extends IGraphElement {

    /**
     * @return the input node
     */
    IInput getInput();

    /**
     * @return the output node
     */
    IOutput getOutput();

    /**
     * Remove this {@link ILink} from the graph
     *
     * Associated pins are disconnected from the link
     */
    void delete();

}
