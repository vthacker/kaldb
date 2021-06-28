package com.slack.kaldb.elasticsearchApi.searchResponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class SearchResponseMetadata {

  @JsonProperty("took")
  private final long took;

  @JsonProperty("responses")
  private final List<SearchResponse> responses;

  public SearchResponseMetadata(long took, List<SearchResponse> responses) {
    this.took = took;
    this.responses = responses;
  }

  public long getTook() {
    return took;
  }

  public List<SearchResponse> getResponses() {
    return responses;
  }
}
