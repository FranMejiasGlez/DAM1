<?xml version="1.0" encoding="UTF-8"?>


<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <xsl:template match="/">
        <xsl:variable name="codigoModulo" select="'1008'"></xsl:variable>
        <xsl:variable name="codigoTitulo" select="1"></xsl:variable>
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
                                            Recopilación de datos para diseñar un plan de medios publicitarios:
                                            <br/>
                                            - Análisis de audiencias efectuados por agrupaciones de medios de comunicación.
                                            <br/>
                                            - Empresas especializadas en elaborar sondeos y estudios de medios publicitarios.
                                            <br/>
                                            - Paneles de consumidores y detallistas.
                                            <br/>
                                            - Estudio de perfiles, audiencias y coberturas de cada soporte publicitario.
                                            <br/>
                                            - Análisis de antecedentes para el estudio del briefing.
                                            <br/>
                                            - Análisis de la actividad publicitaria de la competencia.
                                            <br/>
                                            - Selección del público objetivo para cada medio publicitario (target audience).
                                            <br/>
                                            - Las centrales de compras de medios: concepto y objetivos.
                                            <br/>
                                            - Agencias de publicidad: concepto y clases.
                                            <br/>
                                            - Presentación de datos y resultados en soportes informáticos. Facturas a clientes.
                                            <br/>
                                            Descripción de los medios y soportes publicitarios:
                                            <br/>
                                            - Concepto y clasificación de los medios publicitarios.
                                            <br/>
                                            - Ventajas y desventajas de cada medio publicitario.
                                            <br/>
                                            - Análisis de los aspectos relativos a la prensa.
                                            <br/>
                                            - Ventajas y desventajas de este medio.
                                            <br/>
                                            - Formas y elementos básicos: módulo y robapáginas, entre otros. Elementos específicos.
                                            <br/>
                                            - Formas publicitarias específicas de la TV:
                                            <br/>
                                            · Ventajas y desventajas de este medio.
                                            <br/>
                                            · Formas y elementos básicos: spot, publireportaje y patrocinios, entre otros. Elementos específicos.
                                            <br/>
                                            - Formas publicitarias específicas de la radio:
                                            <br/>
                                            · Ventajas y desventajas de este medio.
                                            <br/>
                                            · Formas y elementos básicos: cuñas, programas, patrocinios, entre otros. Elementos específicos.
                                            <br/>
                                            - Formas publicitarias específicas del cine:
                                            <br/>
                                            · Ventajas y desventajas de este medio.
                                            <br/>
                                            · Formas y elementos básicos: filmmet y publirreportaje, entre otros. Elementos específicos.
                                            <br/>
                                            - Formas publicitarias específicas de la publicidad exterior:
                                            <br/>
                                            · Ventajas y desventajas de este medio.
                                            <br/>
                                            · Formas y elementos básicos: vallas, marquesinas, entre otros. Elementos específicos.
                                            <br/>
                                            - Formas publicitarias específicas de la publicidad en el lugar de ventas (PLV):
                                            <br/>
                                            · Ventajas y desventajas de este medio.
                                            <br/>
                                            · Formas y elementos básicos: cartelería, luminosos, entre otros. Elementos específicos.
                                            <br/>
                                            - Formas publicitarias específicas y peculiares de la publicidad directa (mailings y buzoneo):
                                            <br/>
                                            · Ventajas y desventajas de este medio.
                                            <br/>
                                            · Formas y elementos básicos: sobres, carta, folleto y pedido, entre otros. Elementos específicos.
                                            <br/>
                                            - Concepto de publicity y herramientas utilizadas. Tipos de publicititys más usadas.
                                            <br/>
                                            - Planificación de medios en el entorno online: tipos de formatos de publicidad en Internet y compra de medios online.
                                            <br/>
                                            Colaboración en la realización del plan de medios publicitarios:
                                            <br/>
                                            - Normas generales de la ley general publicitaria aplicables a los contratos publicitarios.
                                            <br/>
                                            - Límites de la publicidad.
                                            <br/>
                                            - Malos usos de la publicidad.
                                            <br/>
                                            - Contrato de publicidad.
                                            <br/>
                                            - Contrato de difusión publicitaria.
                                            <br/>
                                            - Contrato de creación publicitaria.
                                            <br/>
                                            - Contrato de patrocinio publicitario.
                                            <br/>
                                            - Código deontológico de autorregulación publicitaria.
                                            <br/>
                                            - Actos de competencia desleal.
                                            <br/>
                                            - Prácticas comerciales desleales con los consumidores o usuarios.
                                            <br/>
                                            - Publicidad sobre productos susceptibles de generar riesgos para la salud o seguridad de las personas o de su patrimonio.
                                            <br/>
                                            - Métodos de análisis multicriterio basados en diferentes alternativas para la ordenación y selección de los mejores medios.
                                            <br/>
                                            - Cuadro de mando de una campaña en medios.
                                            <br/>
                                            - Preparación de un plan de medios.
                                            <br/>
                                            - Selección de presupuestos ofertados por las agencias publicitarias.
                                            <br/>
                                            - Relaciones de las agencias con los anunciantes y los medios.
                                            <br/>
                                            - Análisis de márgenes y de costes permitidos.
                                            <br/>
                                            - Métodos de medición de la efectividad publicitaria.
                                            <br/>
                                            - Ratios para el análisis de los resultados de las campañas: stats y adstock.
                                            <br/>
                                            - Ratios de efectividad online y offline.
                                            <br/>
                                            Realización de las acciones necesarias para controlar la ejecución del plan de medios:
                                            <br/>
                                            - Órdenes de cursaje de emisión en distintos medios.
                                            <br/>
                                            - Cuadro de mando y control de una campaña.
                                            <br/>
                                            - Relación con proveedores offline y online.
                                            <br/>
                                            - Control en un plan de medios escrito.
                                            <br/>
                                            - Instrumentos de control utilizados habitualmente en televisión y radio.
                                            <br/>
                                            - Cuadros de seguimiento de ejecución de campañas en Internet.
                                            <br/>
                                            - Control del plan de medios en cuanto a frecuencia, tiempos y condiciones pactadas.
                                            <br/>
                                            - Normas de actuación en caso de incumplimiento de las condiciones pactadas.
                                            <br/>
                                            - Herramientas informáticas para controlar los sucesos y datos acaecidos durante la ejecución del pan de medios.
                                            <br/>
                                            - Elaboración de informes a la dirección con herramientas informáticas.
                                            <br/>
                                            Colaboración en la obtención de información por medios propios o por empresas de press-clipping:
                                            <br/>
                                            - Rastreo de los medios informativos online y offline utilizando sistemas automáticos de búsqueda.
                                            <br/>
                                            - Palabras clave para la búsqueda de noticias de las que son objeto.
                                            <br/>
                                            - Ventajas de los seguimientos de informaciones.
                                            <br/>
                                            - Servicios que ofrecen las empresas de press-clipping.
                                            <br/>
                                            - Aplicaciones informáticas de edición y reutilización de las noticias conseguidas a través de un servicio de seguimiento.
                                            <br/>
                                            - Almacenamiento de la información recibida mediante el uso de sistemas de gestión de bases de datos, generando hemerotecas y archivos personalizados.
                                            <br/>
                                            - Tipos de empresas del sector.
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
