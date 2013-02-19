/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.openrtb.common.api;

@SuppressWarnings("all")
public interface BlocklistAPI {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"BlocklistAPI\",\"namespace\":\"org.openrtb.common.api\",\"types\":[{\"type\":\"record\",\"name\":\"BlocklistObj\",\"fields\":[{\"name\":\"publisherID\",\"type\":[\"string\",\"null\"]},{\"name\":\"publisherName\",\"type\":[\"string\",\"null\"]},{\"name\":\"sideID\",\"type\":[\"string\",\"null\"]},{\"name\":\"siteName\",\"type\":[\"string\",\"null\"]}]},{\"type\":\"record\",\"name\":\"Identification\",\"fields\":[{\"name\":\"organization\",\"type\":[\"string\",\"null\"]},{\"name\":\"timestamp\",\"type\":[\"long\",\"null\"]},{\"name\":\"token\",\"type\":[\"string\",\"null\"]}]},{\"type\":\"record\",\"name\":\"Status\",\"fields\":[{\"name\":\"requestToken\",\"type\":[\"string\",\"null\"]},{\"name\":\"statusCode\",\"type\":[\"int\",\"null\"]},{\"name\":\"statusMessage\",\"type\":[\"string\",\"null\"]}]},{\"type\":\"record\",\"name\":\"Advertiser\",\"fields\":[{\"name\":\"landingPageTLD\",\"type\":[\"string\",\"null\"]},{\"name\":\"name\",\"type\":[\"string\",\"null\"]},{\"name\":\"timestamp\",\"type\":[\"long\",\"null\"]},{\"name\":\"blocklist\",\"type\":{\"type\":\"array\",\"items\":\"BlocklistObj\"}}]},{\"type\":\"record\",\"name\":\"BlocklistRequest\",\"fields\":[{\"name\":\"identification\",\"type\":[\"Identification\",\"null\"]},{\"name\":\"advertisers\",\"type\":{\"type\":\"array\",\"items\":\"Advertiser\"}}]},{\"type\":\"record\",\"name\":\"BlocklistResponse\",\"fields\":[{\"name\":\"identification\",\"type\":[\"Identification\",\"null\"]},{\"name\":\"status\",\"type\":[\"Status\",\"null\"]},{\"name\":\"advertisers\",\"type\":{\"type\":\"array\",\"items\":\"Advertiser\"}}]}],\"messages\":{\"send\":{\"request\":[{\"name\":\"blocklistReq\",\"type\":\"BlocklistRequest\"}],\"response\":\"BlocklistResponse\"}}}");
  org.openrtb.common.api.BlocklistResponse send(org.openrtb.common.api.BlocklistRequest blocklistReq) throws org.apache.avro.AvroRemoteException;
}
