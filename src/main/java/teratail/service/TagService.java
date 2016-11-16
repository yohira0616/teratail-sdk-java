package teratail.service;

import teratail.model.question.Question;
import teratail.model.response.TagEntity;
import teratail.model.response.TagListEntity;
import teratail.model.tag.Tag;
import teratail.service.spec.TagServiceSpec;

import java.util.List;

public class TagService implements TagServiceSpec {
  private String accessToken = "";

  private static final String API_BASE = "tags/";

  public TagService() {

  }

  public TagService(String accessToken) {
    this.accessToken = accessToken;
  }

  @Override
  public TagListEntity findAll() {
    return null;
  }

  @Override
  public TagEntity findOne(String tagName) {
    return null;
  }

  @Override
  public TagListEntity findByTagName(String tagName) {
    return null;
  }
}
