<h1 align="center" id="title">Reto IA Generativa</h1>

<p id="description">En este reto utilizaremos una IA generativa en este caso Gemini y la implementaremos con SpringBoot donde el usuario podrá hacer preguntas sobre tres documentos distintos extraídos de la web.
  Mediante Postman se hicieron peticiones GET a cada una de las rutas las cuales contenían los diferentes documentos y en donde mediante la url se hacían las preguntas respecto a el documento.</p>
<p>En la carpeta de Evidencias se muestra el correcto funcionamiento.</p>
<h2>Evidencias del proyecto:</h2>

<img src="https://github.com/jero0137/RetoIA/blob/main/Evidencias/peticion-cuento.png" alt="project-screenshot" width="300" height="300/">

<img src="https://github.com/jero0137/RetoIA/blob/main/Evidencias/peticion-mito.png" alt="project-screenshot" width="300" height="300/">

<img src="https://github.com/jero0137/RetoIA/blob/main/Evidencias/peticion-vanguardia.png" alt="project-screenshot" width="300" height="300/">

<h2>🛠️ Pasos de instalación:</h2>

<p>1. Instalar dependencias</p>

```
.\mvnw install 
```

<p>2. Activar la api de VertexAI en el proyecto de google cloud</p>

```
https://cloud.google.com/vertex-ai/generative-ai/docs/start/quickstarts/quickstart-multimodal?hl=es-419
```

<p>3. Instalar Google CLI</p>

```
https://cloud.google.com/sdk/docs/install?hl=es-419
```

<p>4. Realizar Autenticacion</p>

```
gcloud config set project PROJECT_ID && gcloud auth login ACCOUNT
```

<p>5. Ejecutar proyecto de Spring</p>
