package teratail.service;

import org.junit.Before;
import org.junit.Test;
import teratail.model.response.QuestionEntity;
import teratail.model.response.QuestionListEntity;
import teratail.service.spec.QuestionServiceSpec;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class QuestionServiceTest {

  private QuestionServiceSpec service;

  @Before
  public void setUp() {
    service = new QuestionService();
  }

  @Test
  public void findAllTest() {
    QuestionListEntity entity = service.findAll();
    assertThat(entity.getMeta().getMessage(), is("success"));
  }

  @Test
  public void findOneTest() {
    int questionId = 55458;
    QuestionEntity entity = service.findOne(questionId);
    assertThat(entity.getMeta().getMessage(), is("success"));

  }
}
