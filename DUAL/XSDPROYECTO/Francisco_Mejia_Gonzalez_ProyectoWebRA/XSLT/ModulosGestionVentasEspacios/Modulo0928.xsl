<?xml version="1.0" encoding="UTF-8"?>


<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <xsl:template match="/">
        <xsl:variable name="codigoModulo" select="'0928'"></xsl:variable>
        <xsl:variable name="codigoTitulo" select="3"></xsl:variable>
        <html>

            <head>
                <meta charset="utf-8"/>
                <meta name="viewport" content="width=device-width, initial-scale=1"/>
                <link rel="stylesheet" href="../stylesheet3.css"/>
                <link
                    href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
                    rel="stylesheet"/>
                <script
                    src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js">
                </script>
                <title> 
                    <xsl:value-of select="//Titulos/Titulo[$codigoTitulo]/@Nombre"></xsl:value-of>
                </title>
            </head>

            <body>
                <div class="header">
                    <div class="logo-header">
                        <img src="../img/eusa2021.jpg" alt="Eusa Campus Camara Sevilla"
                             width="222px" height="79px"/>
                    </div>
                    <ul>
                        <li class="links-header">
                            <br></br>
                            <a>
                                <strong>Servicios socioculturales y a la
                                    comunidad</strong>
                            </a>
                        </li>
                        <li class="links-header">
                            <a>
                                <strong>Informática y videojuegos</strong>
                            </a>
                        </li>
                        <li class="links-header">
                            <a>
                                <strong>Administración, marketing y comercio</strong>
                            </a>
                        </li>
                        <li class="links-header">
                            <a>
                                <strong>Imagen y Sonido</strong>
                            </a>
                        </li>
                        <li class="links-header">
                            <a>
                                <strong>Hosteleria y turismo</strong>
                            </a>
                        </li>
                        <li class="links-header">
                            <a>
                                <strong>Actividades Físicas y Deportivas</strong>
                            </a>
                        </li>
                    </ul>
                </div>
                <div class="header2">
                    <h5> CENTRO FP SUPERIOR DE LA CÁMARA DE COMERCIO DE SEVILLA</h5>

                </div>
                <div class="header3">
                    <h2>
                        <xsl:value-of select="//Titulos/Titulo[$codigoTitulo]/@Nombre"></xsl:value-of>
                    </h2> <!--XPATH-->
                </div>
                <div class="header4">
                    <h2>
                        <xsl:value-of select="//Titulos/Titulo[$codigoTitulo]/Modulos/Modulo[@Codigo=concat($codigoModulo,'')]/@Nombre"></xsl:value-of>
                    </h2> <!--XPATH-->
                </div>
                <ul style="margin-right:8%">
                    <div class="contenedor-curso ">
                        <div class="contenedor"
                             style="height:300px;width: 350px;background-color: rgb(0, 0, 114);display:flex;flex-direction:column;justify-self: center;border-radius: 10%; ">
                            <div class="contenedor-curso">
                                <div class="naranja"
                                     style="background-color: #ea9c00;flex:1;border-radius: 999px;margin-top:-5%;margin-left: 5%;margin-right: 5%;font-size: 23px;align-content: center;text-align: center;font-weight: bold;color: white;padding-top: 5%;height: 80px;width:315px">
                                    <p>Modulos requeridos</p>
                                </div>
                            </div>
                            <div class="contenedor-acordeon" style="flex:2;">
                                <div class="accordion rounded-pill" id="contenedor-acordeon"
                                     style="background-color: #0195db; width: 280px; margin-top: -5%; justify-self: center;">
                                    <div class="accordion-item rounded-5 mb-2"
                                         style="border:none; ">
                                        <h2 class="accordion-header"
                                            id="headingcontenedor-acordeon"
                                            style="border-radius: 40px;">
                                            <button class="accordion-button rounded-pill"
                                                    type="button" data-bs-toggle="collapse"
                                                    data-bs-target="#collapseZero"
                                                    style="background-color:#0195db;color:#ffffff ;font-size:15px;font-weight: bold;">
                                                Modulos requeridos
                                            </button>
                                        </h2>
                                        <div id="collapseZero"
                                             class="accordion-collapse collapse"
                                             data-bs-parent="#contenedor-acordeon">
                                            <div class="accordion-body">
                                                <i>No hay informacion</i>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="objetivosgenerales">
                            <div class="accordion rounded-5" id="competenciageneral"
                                 style="background-color: #0195db; max-width: 550px;">
                                <div class="accordion-item rounded-5 mb-2">
                                    <h2 class="accordion-header" id="headingOne">
                                        <button class="accordion-button rounded-5  "
                                                type="button" data-bs-toggle="collapse"
                                                data-bs-target="#collapseOne"
                                                style="background-color:#0195db;color:#ffffff ;font-size: 23px;font-weight: bold;align-items: center;justify-content: center;">
                                            Contenidos Básicos
                                        </button>
                                    </h2>
                                    <div id="collapseOne"
                                         class="accordion-collapse collapse "
                                         data-bs-parent="#accordionExample">
                                        <div class="accordion-body" style="font-size:13px;">
                                            <br/>
                                            Determinación de la estructura organizativa y del tamaño del equipo de ventas:
                                            <br/>
                                            - Funciones del departamento de ventas.
                                            <br/>
                                            - Objetivos y estructura del plan y la fuerza de ventas.
                                            <br/>
                                            - Organización del equipo de ventas: por zonas o territorios geográficos, por productos, por mercados, por clientes y mixta.
                                            <br/>
                                            - Cálculo del tamaño óptimo del equipo de ventas según criterios establecidos.
                                            <br/>
                                            - Número y frecuencia de las visitas a los clientes reales y potenciales.
                                            <br/>
                                            - Diseño y planificación de rutas de ventas.
                                            <br/>
                                            - Asignación a los vendedores de zonas de venta, rutas o clientes.
                                            <br/>
                                            - Aplicaciones informáticas de gestión y control de planes de venta.
                                            <br/>
                                            Determinación de las características del equipo comercial:
                                            <br/>
                                            - Funciones del vendedor en la venta personal.
                                            <br/>
                                            - Tipos de vendedores.
                                            <br/>
                                            - Características personales del vendedor profesional.
                                            <br/>
                                            - Habilidades profesionales, conocimientos y requisitos que se exigen a los comerciales.
                                            <br/>
                                            - Fases del proceso de selección de vendedores.
                                            <br/>
                                            - Descripción del puesto de trabajo.
                                            <br/>
                                            - Perfil del comercial o vendedor: el profesiograma.
                                            <br/>
                                            - Captación y selección de comerciales.
                                            <br/>
                                            Planificación de la asignación de los objetivos de venta a los miembros del equipo comercial:
                                            <br/>
                                            - Objetivos cuantitativos.
                                            <br/>
                                            - Objetivos cualitativos.
                                            <br/>
                                            - Dirección por objetivos.
                                            <br/>
                                            - Asignación de los objetivos de ventas a los miembros del equipo.
                                            <br/>
                                            - Actividades vinculadas al plan de ventas.
                                            <br/>
                                            - Métodos de prospección de clientes.
                                            <br/>
                                            - Creación y mantenimiento de bases de datos.
                                            <br/>
                                            Definición de planes de formación, perfeccionamiento y reciclaje de equipos comerciales:
                                            <br/>
                                            - Formación y habilidades del equipo de ventas.
                                            <br/>
                                            - Definición de las necesidades formativas del equipo de ventas.
                                            <br/>
                                            - Objetivos y métodos de formación en equipos comerciales.
                                            <br/>
                                            - Planes de formación inicial de vendedores.
                                            <br/>
                                            - Programas de perfeccionamiento y formación continua de equipos de comerciales.
                                            <br/>
                                            - Formación teórico-práctica y formación sobre el terreno.
                                            <br/>
                                            - Evaluación de planes de formación.
                                            <br/>
                                            Diseño de un sistema de motivación y retribución del equipo comercial:
                                            <br/>
                                            - Prototipos culturales de empresa.
                                            <br/>
                                            - Estilos de mando y liderazgo.
                                            <br/>
                                            - Técnicas de dinámica y dirección de grupos.
                                            <br/>
                                            - Motivación del equipo de ventas.
                                            <br/>
                                            - Incentivos económicos.
                                            <br/>
                                            - Mejora de las condiciones y promoción interna.
                                            <br/>
                                            - Formación y promoción profesional.
                                            <br/>
                                            - Retribución y rendimiento del equipo de ventas.
                                            <br/>
                                            - Sistemas de remuneración del equipo de ventas.
                                            <br/>
                                            Propuesta de acciones para la gestión de situaciones conflictivas en un equipo de comerciales:
                                            <br/>
                                            - Tipos de conflictos en las relaciones laborales.
                                            <br/>
                                            - Técnicas de resolución de situaciones conflictivas.
                                            <br/>
                                            - Negociación y consenso entre las partes.
                                            <br/>
                                            - Conciliación, mediación y arbitraje.
                                            <br/>
                                            - Métodos de decisión en grupo.
                                            <br/>
                                            Diseño del sistema de evaluación y control de los resultados de ventas y actuación del equipo comercial:
                                            <br/>
                                            - Variables de control: cuantitativas y cualitativas.
                                            <br/>
                                            - Criterios y métodos de evaluación y control de la fuerza de ventas.
                                            <br/>
                                            - Fijación de estándares de evaluación y control.
                                            <br/>
                                            - Evaluación de la actividad de ventas en función de los resultados obtenidos. Cálculo de las desviaciones.
                                            <br/>
                                            - Control estadístico de las ventas.
                                            <br/>
                                            - Control por ratios.
                                            <br/>
                                            - Evaluación de la calidad del trabajo y desempeño comercial.
                                            <br/>
                                            - Evaluación del plan de ventas y satisfacción del cliente.
                                            <br/>
                                            - Acciones correctoras para rectificar las desviaciones con respecto a los objetivos del plan de ventas.
                                            <br/>
                                            - Elaboración de informes de seguimiento y control del equipo de comerciales.
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="competenciaspps">
                            <div class="accordion rounded-5" id="competenciaspps"
                                 style="background-color: #0195db; max-width: 550px; margin-top: 10%;">
                                <div class="accordion-item rounded-5 mb-2">
                                    <h2 class="accordion-header" id="headingTwo">
                                        <button class="accordion-button rounded-5"
                                                type="button" data-bs-toggle="collapse"
                                                data-bs-target="#collapseTwo"
                                                style="background-color:#0195db;color:#ffffff ;font-size: 23px;font-weight: bold;align-items: center;justify-content: center;">
                                            Objetivos Generales
                                        </button>
                                    </h2>
                                    <div id="collapseTwo"
                                         class="accordion-collapse collapse"
                                         data-bs-parent="#accordionExample">
                                        <div class="accordion-body">
                                           
                                            <p style="font-size:13px;">
                                                La formación del módulo contribuye a alcanzar los objetivos generales l), o), p), q), r), s), t), u), v) y x) del ciclo formativo, y las competencias h), l), m), n), ñ), o), p) y r) del título.
                                            </p>
                                             
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </ul>
                <div class="contenedor-ResultadosAprendizaje">
                    <div class="resultado">
                        <p>Resultados</p>
                    </div>
                    <ul style="margin-left: 12%;">
                        <xsl:for-each select="//Titulos/Titulo[$codigoTitulo]/Modulos/Modulo[@Codigo=concat($codigoModulo,'')]/ResultadoDeAprendizaje">
                            <xsl:variable name="idAc" select="position()" />
                            <xsl:variable name="idResultado" select="@Codigo"/>
                            <br></br>
                            <div class="ra">
                                <div class="accordion rounded-5" id="accordion2{$idAc}"
                                     style="background-color: #0195db; max-width: 550px;">
                                    <div class="accordion-item rounded-5 mb-2">
                                        <h2 class="accordion-header" id="heading{$idAc}">
                                            <button class="accordion-button rounded-5  "
                                                    type="button" data-bs-toggle="collapse"
                                                    data-bs-target="#collapse{$idAc}"
                                                    style="background-color:#0195db;color:#ffffff ;font-size: 23px;font-weight: bold;align-items: center;justify-content: center;">
                                                  
                                                <xsl:value-of select="@Codigo"></xsl:value-of> - <xsl:value-of select="@Descripcion"></xsl:value-of>
                                                
                                            </button>
                                        </h2>
                                        <div id="collapse{$idAc}"
                                             class="accordion-collapse collapse"
                                             data-bs-parent="#accordion2{$idAc}">
                                            <div class="accordion-body">
                                                <xsl:for-each select="//Titulos/Titulo[$codigoTitulo]/Modulos/Modulo[@Codigo=concat($codigoModulo,'')]/ResultadoDeAprendizaje[@Codigo=concat($idResultado,'')]/CriterioDeEvaluacion">
                                                    <li style="list-style:none;text-decoration:none;font-size:13px;">
                                                        <b>Codigo: </b> 
                                                        <xsl:value-of select="@Codigo"></xsl:value-of> 
                                                        <br></br>
                                                        <b>Descripcion: </b> 
                                                        <xsl:value-of select="@Descripcion"></xsl:value-of>
                                                    </li>
                                                </xsl:for-each>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <br></br>
                        </xsl:for-each>
                    </ul>
                </div>
                <div class="footer">
                    <div class="logoFooter">
                        <img src="../img/logoCampusCamara.png"
                             alt="logo Centro FP SUPERIOR" width="218px"
                             height="78px"
                             class="imagen"/>
                    </div>
                    <div class="redes">
                        <img src="../img/icons8-instagram-50.png"
                             alt="Instagram"/>
                        <img src="../img/icons8-youtube-50.png" alt="Youtube"/>
                        <img src="../img/logo-de-facebook.png" alt="Facebook"
                             width="50px" height="50px"/>
                    </div>
                    <div class="contacto">
                        <ul
                            style="align-content: center;list-style-type: none;">
                            <li>
                                <img src="../img/correo-electronico.png"
                                     alt="Correo Electrónico"/>
                                <p
                                    style="color:white;font-size:20px">info@fpcampuscamara.es</p>
                            </li>
                            <li>
                                <img src="../img/llamada.png" alt="Teléfono"/>
                                <p style="color:white;font-size:20px">954238797</p>
                            </li>
                        </ul>
                    </div>
                </div>
            </body>

        </html>
    </xsl:template>

</xsl:stylesheet>
