<?xml version="1.0" encoding="UTF-8"?>


<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <xsl:template match="/">
        <xsl:variable name="codigoModulo" select="'1109'"></xsl:variable>
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
                                            Recopilación de la información necesaria para el lanzamiento de un producto o servicio:
                                            <br/>
                                            - Fuentes de información internas y externas.
                                            <br/>
                                            - Fuentes de información del mercado, el entorno y la competencia.
                                            <br/>
                                            - Elaboración de la información relevante sobre el producto, servicio o gama de productos.
                                            <br/>
                                            - Información obtenida de la red de ventas y de las sugerencias de los clientes.
                                            <br/>
                                            - Fases del proceso de creación de nuevos productos.
                                            <br/>
                                            - Fase de lanzamiento del producto o servicio. Pasos necesarios.
                                            <br/>
                                            - Análisis de las oportunidades de mercado. Análisis interno y externo. Análisis DAFO.
                                            <br/>
                                            Elaboración del argumentario de ventas y presentación del producto/servicio a la red de ventas:
                                            <br/>
                                            - Los argumentos de ventas. Tipos de argumentos.
                                            <br/>
                                            - El argumentarlo de ventas.
                                            <br/>
                                            - Elaboración del argumentario de ventas según el tipo de producto, la tipología de clientes y los tipos de canales de distribución y comercialización.
                                            <br/>
                                            - Descripción del producto. Diferenciación del producto de los de la competencia.
                                            <br/>
                                            - Objeciones del cliente. Técnicas de venta y refutación de las objeciones.
                                            <br/>
                                            - Presentación del producto o servicio a la red de ventas propia o ajena.
                                            <br/>
                                            - Material de apoyo necesario para la presentación.
                                            <br/>
                                            - Plan de formación de la red de ventas.
                                            <br/>
                                            - Motivación de la red de ventas.
                                            <br/>
                                            Definición de las acciones de marketing y promoción:
                                            <br/>
                                            - Publicidad y promoción.
                                            <br/>
                                            - La publicidad en el lugar de venta (PLV).
                                            <br/>
                                            - Merchandising y animación en el punto de venta.
                                            <br/>
                                            - Implantación de productos en el punto de venta.
                                            <br/>
                                            - La promoción de ventas. Objetivos.
                                            <br/>
                                            - Acciones de marketing y promoción dirigidas al lanzamiento de productos/servicios.
                                            <br/>
                                            - Acciones promocionales en función del público objetivo.
                                            <br/>
                                            - La promoción del fabricante y del establecimiento comercial. Formas de promoción dirigidas a los intermediarios y distribuidores.
                                            <br/>
                                            - Formas de promoción dirigidas a los vendedores y prescriptores.
                                            <br/>
                                            - Tipos de promoción dirigidas al consumidor final.
                                            <br/>
                                            - Ventas y promociones especiales.
                                            <br/>
                                            - Acciones de fidelización de clientes.
                                            <br/>
                                            - Tipos de acciones promocionales según el punto de venta.
                                            <br/>
                                            - Marketing directo. Acciones de marketing directo para el lanzamiento del producto.
                                            <br/>
                                            - Herramientas de promoción online.
                                            <br/>
                                            Programación del lanzamiento e implantación de un producto o servicio en el mercado:
                                            <br/>
                                            - Estrategias comerciales de lanzamiento de un producto.
                                            <br/>
                                            - Desarrollo de las acciones de marketing y promoción comercial, de acuerdo con el plan de marketing, el briefing del producto y los acuerdos con los distribuidores.
                                            <br/>
                                            - Elementos publicitarios en el punto de venta. Indicadores visuales.
                                            <br/>
                                            - Aplicación de técnicas de merchandising y animación del punto de venta.
                                            <br/>
                                            - Aplicación de técnicas de implantación del producto en el punto de venta.
                                            <br/>
                                            - Criterios comerciales y de organización para la implantación del producto.
                                            <br/>
                                            - Implantación de acciones promocionales en el punto de venta. Organización de recursos materiales y humanos. Presupuesto.
                                            <br/>
                                            - Desarrollo de acciones de marketing directo. Recursos materiales y humanos. Organización. Presupuesto.
                                            <br/>
                                            - Implantación de programas de fidelización de clientes.
                                            <br/>
                                            - Herramientas de promoción online.
                                            <br/>
                                            Medidas de seguimiento y control del lanzamiento de un producto o servicio:
                                            <br/>
                                            - Control y medición de resultados. Fijación de estándares y parámetros de control.
                                            <br/>
                                            - Rentabilidad de la implantación del producto.
                                            <br/>
                                            - Índices de implantación del producto en el punto de venta.
                                            <br/>
                                            - Rentabilidad directa del producto.
                                            <br/>
                                            - Ratios económico-financieros.
                                            <br/>
                                            - Análisis de resultados. Cálculo de las desviaciones con respecto a los objetivos fijados. Aplicación de acciones correctoras.
                                            <br/>
                                            - Control de las acciones promocionales y de marketing directo. Criterios y medidas de evaluación y control.
                                            <br/>
                                            - Cálculo del coste de la campaña promocional o acción de marketing.
                                            <br/>
                                            - Evaluación de la eficacia de una campaña promocional. Tasa de rentabilidad de la campaña. Ratios económico-administrativos
                                            <br/>
                                            - Cálculo de las desviaciones de los resultados con respecto a los objetivos. Aplicación de acciones correctoras.
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
                                                La formación del módulo contribuye a alcanzar los objetivos generales m), o), p), q), r), s), t), u), v), w) y x) del ciclo formativo, y las competencias i), l), m), n), ñ), o), p), q) y r) del título.
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
