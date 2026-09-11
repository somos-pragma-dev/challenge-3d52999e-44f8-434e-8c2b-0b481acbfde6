# Diseño y Desarrollo de una API REST Empresarial con Spring Boot

La empresa necesita una API REST para gestionar productos y pedidos en su plataforma de e-commerce. El sistema debe manejar la autenticación basada en JWT, la gestión de roles, la documentación de la API, y el manejo de errores estandarizado. Además, debe soportar paginación y ordenamiento en los endpoints de listado, y ser desplegable en contenedores Docker. Los productos, pedidos y clientes son las entidades principales, con relaciones OneToMany y ManyToMany. La arquitectura debe ser en capas, siguiendo los principios SOLID y el clean code.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | spring-boot-enterprise-architecture |
| **Nivel** | advanced-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 30 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: Un IDE o editor de código.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Verifica que el proyecto arranca sin errores.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Modelado de Datos

**Objetivo:** Definir y estructurar las entidades del dominio para la gestión de productos, pedidos y clientes.

**Tiempo estimado:** 5 horas

**Instrucciones:**

- Identificar y modelar las entidades Product, Order y Customer, incluyendo sus relaciones y atributos.
- Definir las restricciones y validaciones necesarias para cada entidad.
- Establecer las relaciones OneToMany y ManyToMany entre las entidades.

**Entregable:** Modelo de datos con entidades y relaciones definidas.

<details>
<summary>Pistas de conocimiento</summary>

- Considera los atributos necesarios para cada entidad y cómo se relacionan en el contexto del e-commerce.
- Piensa en las validaciones y restricciones que deben aplicarse a cada entidad para garantizar la integridad de los datos.

</details>

### Fase 2: Autenticación y Autorización

**Objetivo:** Implementar la autenticación basada en JWT y la gestión de roles para la API.

**Tiempo estimado:** 6 horas

**Instrucciones:**

- Configurar la autenticación basada en JWT con Spring Security.
- Definir los roles de ADMIN y USER y asignar accesos diferenciados por endpoint.
- Implementar la lógica de autenticación y autorización en los controladores REST.

**Entregable:** Configuración de autenticación y autorización con JWT y Spring Security.

<details>
<summary>Pistas de conocimiento</summary>

- Recuerda que los roles deben tener accesos diferenciados según el endpoint.
- Piensa en cómo implementar la lógica de autenticación y autorización de manera segura y eficiente.

</details>

### Fase 3: Documentación y Manejo de Errores

**Objetivo:** Documentar la API usando OpenAPI 3.0 y Swagger UI, y manejar los errores de manera centralizada.

**Tiempo estimado:** 4 horas

**Instrucciones:**

- Configurar la documentación automática de la API con OpenAPI 3.0 y Swagger UI.
- Implementar el manejo centralizado de errores con @ControllerAdvice y respuestas estandarizadas en formato JSON.
- Asegurar que la documentación esté accesible en /api-docs.

**Entregable:** Documentación de la API con OpenAPI 3.0 y Swagger UI, y manejo centralizado de errores.

<details>
<summary>Pistas de conocimiento</summary>

- Recuerda que la documentación debe ser accesible en /api-docs.
- Piensa en cómo estandarizar las respuestas de error para que sean coherentes y útiles para los usuarios de la API.

</details>

### Fase 4: Paginación y Ordenamiento

**Objetivo:** Implementar la paginación y el ordenamiento de resultados en los endpoints de listado.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Implementar la paginación y el ordenamiento de resultados en los endpoints de listado usando Pageable.
- Asegurar que los endpoints de listado soporten paginación y ordenamiento.
- Validar que la paginación y el ordenamiento funcionen correctamente en los endpoints de listado.

**Entregable:** Implementación de paginación y ordenamiento en los endpoints de listado.

<details>
<summary>Pistas de conocimiento</summary>

- Recuerda que los endpoints de listado deben soportar paginación y ordenamiento.
- Piensa en cómo implementar la paginación y el ordenamiento de manera eficiente y coherente con el resto de la API.

</details>

### Fase 5: Pruebas y Containerización

**Objetivo:** Implementar pruebas unitarias y de integración, y containerizar la aplicación con Docker.

**Tiempo estimado:** 12 horas

**Instrucciones:**

- Implementar pruebas unitarias con JUnit 5 y Mockito cubriendo la capa de servicio al menos al 80%.
- Implementar pruebas de integración con @SpringBootTest verificando los flujos principales.
- Containerizar la aplicación con Docker usando Dockerfile multi-stage optimizado para producción.

**Entregable:** Pruebas unitarias y de integración implementadas, y aplicación containerizada con Docker.

<details>
<summary>Pistas de conocimiento</summary>

- Recuerda que las pruebas unitarias deben cubrir al menos el 80% de la capa de servicio.
- Piensa en cómo verificar los flujos principales con pruebas de integración.
- Considera la optimización del Dockerfile para producción.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es la autenticación basada en JWT y cómo se implementa en la API?
- **paraQueSirve**: ¿Para qué sirve la paginación y el ordenamiento en los endpoints de listado?
- **comoSeUsa**: ¿Cómo se usa OpenAPI 3.0 y Swagger UI para documentar la API?
- **erroresComunes**: ¿Cuáles son los errores comunes al implementar la autenticación y autorización en la API?
- **queDecisionesImplica**: ¿Qué decisiones implica la containerización de la aplicación con Docker?

## Criterios de Evaluacion

- Modelo de datos con entidades y relaciones definidas.
- Configuración de autenticación y autorización con JWT y Spring Security.
- Documentación de la API con OpenAPI 3.0 y Swagger UI, y manejo centralizado de errores.
- Implementación de paginación y ordenamiento en los endpoints de listado.
- Pruebas unitarias y de integración implementadas, y aplicación containerizada con Docker.

## Como trabajar con un asistente de IA

- **AGENTS.md** — instrucciones nativas del repo (Cursor, Codex, Copilot, Gemini, Claude Code). Abrí el proyecto y el agente las carga solo.
- **PROMPT_MEJORA.md** — el mismo prompt, para copiar y pegar en un chat (claude.ai, ChatGPT, etc.).

---

*Reto generado automaticamente por Challenge Generator - Pragma*
