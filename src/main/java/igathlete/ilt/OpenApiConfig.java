package igathlete.ilt;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Catalog API",
                version = "1.0",
                description = "REST API for managing product catalogs"
        )
)
public class OpenApiConfig {}