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
package com.intel.tools.fdk.graphframework.graph.impl;

import com.intel.tools.fdk.graphframework.graph.ILink;

/**
 * Represent a graph Link (i.e Edge).</br>
 *
 * A link connects a node to another node (or itself).</br>
 * The link does not carry the information of which inputs/outputs are connected.
 */
public final class Link implements ILink {

    private final Input input;
    private final Output output;

    public Link(final Input input, final Output output) {
        this.input = input;
        this.output = output;
        this.input.connect(this);
        this.output.connect(this);
    }

    @Override
    public Input getInput() {
        return input;
    }

    @Override
    public Output getOutput() {
        return output;
    }

}
