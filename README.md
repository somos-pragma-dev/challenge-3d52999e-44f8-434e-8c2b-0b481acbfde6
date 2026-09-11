# Desarrollo de una API REST Empresarial para e-Commerce

Debes desarrollar una API REST para gestionar productos y pedidos en una plataforma de e-commerce. La API debe manejar la autenticación y autorización basada en JWT, modelar datos con relaciones OneToMany y ManyToMany, y proporcionar documentación automática con OpenAPI 3.0. El sistema debe ser capaz de manejar paginación y ordenamiento de resultados, y debe ser probado y containerizado para producción.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Arquitectura Empresarial con Spring Boot |
| **Nivel** | junior-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 20 horas |

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

### Fase 1: Modelado de Datos y Autenticación

**Objetivo:** Definir y modelar las entidades Product, Order y Customer, e implementar la autenticación y autorización basada en JWT.

**Tiempo estimado:** 5 horas

**Instrucciones:**

- Modelar las entidades Product, Order y Customer con relaciones OneToMany y ManyToMany.
- Implementar la autenticación y autorización basada en JWT con roles de ADMIN y USER.

**Entregable:** Modelo de datos completo y sistema de autenticación y autorización funcional.

<details>
<summary>Pistas de conocimiento</summary>

- Considera la consistencia y la integridad de los datos al modelar las relaciones.
- Piensa en cómo manejar los diferentes roles y permisos en la autenticación.

</details>

### Fase 2: Implementación de Servicios y Controladores REST

**Objetivo:** Implementar los servicios de negocio y los controladores REST para las operaciones CRUD en productos y pedidos.

**Tiempo estimado:** 5 horas

**Instrucciones:**

- Crear servicios de negocio para las operaciones CRUD en productos y pedidos.
- Implementar controladores REST que expongan las funcionalidades de los servicios.

**Entregable:** Servicios de negocio y controladores REST funcionales para las operaciones CRUD.

<details>
<summary>Pistas de conocimiento</summary>

- Aplica principios SOLID y clean code en la implementación de los servicios y controladores.
- Considera cómo manejar los errores y las validaciones en las entradas.

</details>

### Fase 3: Documentación y Manejo de Errores

**Objetivo:** Proveer documentación automática con OpenAPI 3.0 y manejar los errores de forma centralizada.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Configurar OpenAPI 3.0 para documentar automáticamente la API.
- Implementar un manejo centralizado de errores con respuestas estandarizadas en formato JSON.

**Entregable:** Documentación automática de la API y manejo centralizado de errores funcional.

<details>
<summary>Pistas de conocimiento</summary>

- Piensa en cómo la documentación puede mejorar la usabilidad de la API para los desarrolladores.
- Considera cómo un manejo centralizado de errores puede mejorar la consistencia y la claridad de las respuestas.

</details>

### Fase 4: Pruebas y Containerización

**Objetivo:** Implementar pruebas unitarias y de integración, y containerizar la aplicación para producción.

**Tiempo estimado:** 7 horas

**Instrucciones:**

- Escribir pruebas unitarias con JUnit 5 y Mockito cubriendo la capa de servicio al menos al 80%.
- Escribir pruebas de integración con @SpringBootTest verificando los flujos principales.
- Containerizar la aplicación con Docker usando Dockerfile multi-stage optimizado para producción.

**Entregable:** Pruebas unitarias y de integración completas, y aplicación containerizada para producción.

<details>
<summary>Pistas de conocimiento</summary>

- Asegúrate de que las pruebas cubran los casos de uso más importantes y los edge cases.
- Piensa en cómo la containerización puede mejorar la portabilidad y la escalabilidad de la aplicación.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué son las entidades Product, Order y Customer y cómo se relacionan en el dominio del e-commerce?
- **paraQueSirve**: ¿Para qué sirve la autenticación y autorización basada en JWT en el contexto de la API REST?
- **comoSeUsa**: ¿Cómo se usan los servicios de negocio y los controladores REST para implementar las operaciones CRUD?
- **erroresComunes**: ¿Cuáles son los errores comunes que pueden ocurrir al modelar las relaciones entre entidades y cómo se pueden evitar?
- **queDecisionesImplica**: ¿Qué decisiones implica la implementación de un manejo centralizado de errores y cómo se pueden justificar?

## Criterios de Evaluacion

- Modelado correcto de las entidades Product, Order y Customer con relaciones OneToMany y ManyToMany.
- Implementación funcional de la autenticación y autorización basada en JWT con roles de ADMIN y USER.
- Servicios de negocio y controladores REST funcionales para las operaciones CRUD.
- Documentación automática de la API con OpenAPI 3.0 y manejo centralizado de errores.
- Pruebas unitarias y de integración completas, y aplicación containerizada para producción.

## Como trabajar con un asistente de IA

- **AGENTS.md** — instrucciones nativas del repo (Cursor, Codex, Copilot, Gemini, Claude Code). Abrí el proyecto y el agente las carga solo.
- **PROMPT_MEJORA.md** — el mismo prompt, para copiar y pegar en un chat (claude.ai, ChatGPT, etc.).

---

*Reto generado automaticamente por Challenge Generator - Pragma*
