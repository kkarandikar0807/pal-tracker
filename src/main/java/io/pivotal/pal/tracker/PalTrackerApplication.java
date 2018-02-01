package io.pivotal.pal.tracker;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
<<<<<<< HEAD
=======
import javax.sql.DataSource;
>>>>>>> 36a1e68ddc0a7612a7cd2fafb42c6bd9fee91964
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

<<<<<<< HEAD
import javax.sql.DataSource;
import java.util.TimeZone;

=======
>>>>>>> 36a1e68ddc0a7612a7cd2fafb42c6bd9fee91964
@SpringBootApplication
public class PalTrackerApplication {

    public static void main(String[] args) {
<<<<<<< HEAD
        // Make sure the application runs as UTC
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
=======
>>>>>>> 36a1e68ddc0a7612a7cd2fafb42c6bd9fee91964
        SpringApplication.run(PalTrackerApplication.class, args);
    }

    @Bean
<<<<<<< HEAD
    TimeEntryRepository timeEntryRepository(DataSource dataSource) {
        return new JdbcTimeEntryRepository(dataSource);
=======
    TimeEntryRepository timeEntryRepository(DataSource datasource) {
        return new JdbcTimeEntryRepository(datasource);
>>>>>>> 36a1e68ddc0a7612a7cd2fafb42c6bd9fee91964
    }

    @Bean
    public ObjectMapper jsonObjectMapper() {
        return Jackson2ObjectMapperBuilder.json()
                .serializationInclusion(JsonInclude.Include.NON_NULL) // Don’t include null values
                .featuresToDisable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS) //ISODate
                .modules(new JavaTimeModule())
                .build();
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 36a1e68ddc0a7612a7cd2fafb42c6bd9fee91964
