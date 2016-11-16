package teratail.service;


import org.junit.Before;
import org.junit.Test;
import teratail.model.response.tag.TagEntity;
import teratail.service.spec.TagServiceSpec;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TagServiceTest {

  private TagServiceSpec service;

  @Before
  public void setUp() {
    service = new TagService();
  }

  @Test
  public void test() {
    TagEntity entity = service.findOne("ActionScript");
    assertThat(entity.getMeta().getMessage(), is("success"));

  }
}
