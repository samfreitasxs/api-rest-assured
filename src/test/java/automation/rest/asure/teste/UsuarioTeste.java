/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package automation.rest.asure.teste;

import automation.rest.asure.dominio.Usuario;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;

public class UsuarioTeste {

    @BeforeClass
    public static void setup() {
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        baseURI = "https://reqres.in";
        basePath = "/api";
    }


    @Test public void testeListMetadadosDoUsuario() {
        given().
                param("page", "2").
        when().
                get("/users").
        then().
                statusCode(HttpStatus.SC_OK).
                body("page", is(2)).
                body("data", is(notNullValue()));
    }


    @Test
    public void testeCriarUsuarioComSucesso(){
        Usuario usuario = new Usuario("Samuel","eng test", "email@gmail.com" );
        given().
                contentType(ContentType.JSON).
                body(usuario).
        when().
                post("/user").
        then().
                statusCode(HttpStatus.SC_CREATED).
                body("name", is( "Samuel"));
    }
}
