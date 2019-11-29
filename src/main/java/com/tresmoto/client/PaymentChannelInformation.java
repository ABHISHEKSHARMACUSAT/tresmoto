package com.tresmoto.client;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.tresmoto.constants.AppType;
import com.tresmoto.constants.ChannelType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaymentChannelInformation {

    @JsonProperty(value = "channelType")
    ChannelType channelType;

    @JsonProperty(value = "appType")
    AppType appType;

    @JsonProperty(value = "ip")
    String ip;

    @JsonProperty(value = "referer")
    String referer;

    @JsonProperty(value = "userAgent")
    String userAgent;

}
