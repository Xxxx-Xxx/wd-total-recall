Feature: REST Air search service, ADC-193, Flex pricer, GET service, SB4
#  https://support.datalex.com/jira/browse/ADC-193



  Scenario Outline: Scenario 1 - GET airSearchRQ request can be successfully processed in JSON format

    Given User sends first POST airSearchRQ rest request with following parameters
      | Request_Format | Response_Format | ClientId   | Flexible   | SearchType   | OWC   | Origin   | Destination   | OriginDate   | DestinationDate   | AdtQty   | ChildQty   | InfQty   | UNNQty   |
      | JSON           | JSON            | <ClientId> | <Flexible> | <SearchType> | <OWC> | <Origin> | <Destination> | <OriginDate> | <DestinationDate> | <AdtQty> | <ChildQty> | <InfQty> | <UNNQty> |
#    And FLIGHT rest results in first airSearchRS are not empty
#
#    When User has second GET airSearchRQ rest request with following parameters
#      | Response_Format | ClientId   |
#      | JSON            | <ClientId> |
#    And value of search-id for second GET airSearchRQ is taken from first POST airSearchRS rest response
#    And User sends second GET airSearchRQ rest request
#
#    Then FLIGHT rest results in second airSearchRS are not empty

  @inDev
    Examples:
      | ClientId               | Flexible | SearchType | OWC  | Origin | Destination | OriginDate | DestinationDate | AdtQty | ChildQty | InfQty | UNNQty |
      | LH_A-NYC_MKI-I_US-FLEX | false    | OW         | none | DUS    | FRA         | 15         | none            | 1      | 0        | 0      | 0      |
#      | LX_A-NYC_MKI-I_US-FLEX | false    | OW         | none | ZRH    | NYC         | 15         | none            | 1      | 0        | 0      | 0      |
#      | OS_A-SIN_MKI-I_TH-FLEX | false    | OW         | none | VIE    | MAD         | 15         | none            | 1      | 0        | 0      | 0      |