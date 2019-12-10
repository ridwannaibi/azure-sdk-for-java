// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos.implementation.directconnectivity;

import com.azure.cosmos.CosmosResponseDiagnostics;

/**
 * This is meant to be used only internally as a bridge access to classes in
 * com.azure.cosmos.implementation.directconnectivity
 **/
public class DirectBridgeInternal {

    public static void setCosmosResponseDiagnostics(StoreResponse storeResponse, CosmosResponseDiagnostics cosmosResponseDiagnostics) {
        storeResponse.setCosmosResponseDiagnostics(cosmosResponseDiagnostics);
    }

    public static int getSubStatusCode(StoreResponse storeResponse) {
        return storeResponse.getSubStatusCode();
    }
}
