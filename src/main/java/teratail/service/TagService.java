package teratail.service;

import teratail.model.question.Question;
import teratail.model.tag.Tag;
import teratail.service.spec.TagServiceSpec;

import java.util.List;

public class TagService implements TagServiceSpec {
  private String accessToken = "";

  public TagService() {

  }

  public TagService(String accessToken) {
    this.accessToken = accessToken;
  }

  @Override
  public List<Tag> findAll() {
    return null;
  }

  @Override
  public Tag findOne(String tagName) {
    return null;
  }

  @Override
  public List<Question> findByTagName(String tagName) {
    return null;
  }
}
