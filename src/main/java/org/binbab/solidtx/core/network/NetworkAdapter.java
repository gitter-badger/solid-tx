/*
 * This file is part of the Solid TX project.
 *
 * Copyright (c) 2015. sha1(OWNER) = df334a7237f10846a0ca302bd323e35ee1463931
 * --> See LICENSE.txt for more information.
 *
 * @author BinaryBabel OSS (http://code.binbab.org)
 */

package org.binbab.solidtx.core.network;

import java.io.InputStream;

//TODO - Rename to EndpointAdapter

/**
 * Responsible for encoding/decoding Payloads and PayloadRequests
 * between byte data and/or io streams.
 *
 * @see org.binbab.solidtx.core.network.Payload
 * @see org.binbab.solidtx.core.network.PayloadRequest
 */
public interface NetworkAdapter {

    /**
     * Encode PayloadRequest to byte data.
     *
     * @param request the payload request
     * @return the encoded byte data
     */
    public byte[] encodePayloadRequest(PayloadRequest request);

    /**
     * Decode Payload from a raw InputStream.
     *
     * @param io the input containing the raw payload
     * @return the decoded payload
     */
    public Payload decodePayload(InputStream io);

}
