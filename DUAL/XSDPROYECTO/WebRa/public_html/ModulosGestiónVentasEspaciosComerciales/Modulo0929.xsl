<?xml version="1.0" encoding="UTF-8"?>


<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <xsl:template match="/">
        <xsl:variable name="codigoModulo" select="'0929'"></xsl:variable>
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
                                            Obtención de la información necesaria para la definición de estrategias comerciales y la elaboración del plan de ventas:
                                            <br/>
                                            - Fuentes de información internas y externas.
                                            <br/>
                                            - Información sobre el mercado, el entorno y la competencia.
                                            <br/>
                                            - Información sobre la empresa y las actividades comerciales.
                                            <br/>
                                            - Información relevante sobre el producto, servicio o gama de productos.
                                            <br/>
                                            - Información sobre la actividad comercial de la empresa.
                                            <br/>
                                            - Información obtenida de los clientes. Procedimientos de obtención.
                                            <br/>
                                            - Información obtenida de los comerciales y la red de ventas. Métodos de obtención.
                                            <br/>
                                            - Elaboración de ficheros de clientes actuales y potenciales.
                                            <br/>
                                            - Actualización y mantenimiento de bases de datos de clientes.
                                            <br/>
                                            Identificación de nuevas oportunidades de negocio que contribuyan a optimizar la gestión comercial de la empresa:
                                            <br/>
                                            - Análisis de la evolución de las ventas: por zonas geográficas, por tipo de clientes, por segmentos de mercado y por productos, marcas o líneas de productos.
                                            <br/>
                                            - Cálculo de la rentabilidad de productos, líneas o gamas de productos, a partir de los costes y el punto muerto.
                                            <br/>
                                            - Análisis comparativo de los productos propios y de la competencia, aplicando criterios comerciales.
                                            <br/>
                                            - Comparación de la oferta y la demanda de productos.
                                            <br/>
                                            - Análisis de la estructura del mercado: mercado actual y mercado potencial.
                                            <br/>
                                            - Análisis de las oportunidades de mercado. Análisis interno y externo. Análisis DAFO (debilidades, amenazas, fortalezas y oportunidades). Análisis del ciclo de vida del producto. Mapas de posicionamiento del producto.
                                            <br/>
                                            - Análisis de los segmentos de mercado atractivos para la empresa. Perfil de los clientes reales y potenciales.
                                            <br/>
                                            - Estrategias comerciales de producto según distintos criterios.
                                            <br/>
                                            Elaboración del plan y el argumentario de ventas del producto o servicio:
                                            <br/>
                                            - El argumentario de ventas: objetivos, contenido y estructura.
                                            <br/>
                                            - Tipos de argumentos: racionales y emocionales.
                                            <br/>
                                            - Descripción del producto. Utilidades, especificaciones técnicas, precio y servicio.
                                            <br/>
                                            - Inventario de fortalezas y debilidades del producto o servicio.
                                            <br/>
                                            - Elaboración del argumentario de ventas según tipos de productos, tipología de clientes y tipo de canales de distribución y comercialización.
                                            <br/>
                                            - Técnicas de venta: modelo AIDA (atención, interés, deseo, acción). Método SPIN (situación, problema, implicación, necesidad). Sistema de entrenamiento Zelev Noel.
                                            <br/>
                                            - Técnicas y argumentos para refutar las posibles objeciones del cliente.
                                            <br/>
                                            - Elaboración del plan de ventas de acuerdo con el plan de marketing.
                                            <br/>
                                            - Elaboración del programa de ventas y las líneas propias de actuación comercial.
                                            <br/>
                                            Gestión de la información necesaria para garantizar la disponibilidad de productos y la prestación de servicios:
                                            <br/>
                                            - Cálculo de la cantidad de productos y/o folletos de servicios necesarios en el establecimiento para garantizar un índice de cobertura óptimo.
                                            <br/>
                                            - Solicitud de productos y recursos necesarios para la prestación del servicio, para asegurar la disponibilidad de productos y la satisfacción del cliente.
                                            <br/>
                                            - Control periódico de existencias de productos en función de los recursos disponibles y según el procedimiento establecido.
                                            <br/>
                                            - Desajustes entre el inventario contable y el inventario real de productos.
                                            <br/>
                                            - Cálculo del coste de la rotura de stocks, la rotación y la estacionalidad de las ventas.
                                            <br/>
                                            - Capacidad de prestación del servicio en función de los recursos disponibles, para garantizar la calidad del servicio prestado.
                                            <br/>
                                            Gestión del proceso de venta del producto y servicio:
                                            <br/>
                                            - Métodos o formas de venta: tradicional, autoservicio, sin tienda, online y otros.
                                            <br/>
                                            - La venta personal. La función del vendedor en la venta personal.
                                            <br/>
                                            - La comunicación en las relaciones comerciales. Información y comunicación.
                                            <br/>
                                            - El proceso de comunicación. Elementos. Dificultades en la comunicación.
                                            <br/>
                                            - Tipos de comunicación: interna y externa, formal e informal, verbal y no verbal.
                                            <br/>
                                            - La comunicación verbal. Normas para hablar en público.
                                            <br/>
                                            - La comunicación telefónica. Utilización de las nuevas tecnologías.
                                            <br/>
                                            - La comunicación escrita.
                                            <br/>
                                            - La comunicación no verbal.
                                            <br/>
                                            - El proceso de venta: fases.
                                            <br/>
                                            - Métodos de prospección y búsqueda de clientes.
                                            <br/>
                                            - Preparación de la venta: concertación y preparación de la visita.
                                            <br/>
                                            - Desarrollo de la entrevista y cierre de la venta. Técnicas de venta.
                                            <br/>
                                            - Seguimiento de la venta.
                                            <br/>
                                            - Cobro de la venta.
                                            <br/>
                                            - Documentación generada en la venta. Confección y archivo de documentos.
                                            <br/>
                                            Diseño del proceso de negociación de las condiciones de una operación comercial:
                                            <br/>
                                            - La negociación en las relaciones comerciales.
                                            <br/>
                                            - La negociación como alternativa en la toma de decisiones.
                                            <br/>
                                            - Variables básicas de la negociación: entorno, objetivos, tiempo, información, límites de la negociación y relación de poder entre las partes.
                                            <br/>
                                            - Diferentes estilos de negociar. Actitud dura-agresiva, actitud sumisa-servicial y actitud de cooperación y diálogo.
                                            <br/>
                                            - Cualidades del buen negociador.
                                            <br/>
                                            - Reglas para obtener el éxito en la negociación.
                                            <br/>
                                            - Fases de un proceso de negociación.
                                            <br/>
                                            - Preparación de la negociación.
                                            <br/>
                                            - Desarrollo de la negociación.
                                            <br/>
                                            - El pacto o acuerdo.
                                            <br/>
                                            - Seguimiento de la negociación.
                                            <br/>
                                            - Estrategia y tácticas de negociación.
                                            <br/>
                                            Elaboración de contratos de compraventa y otros afines:
                                            <br/>
                                            - El contrato: características y requisitos básicos. Clases de contratos.
                                            <br/>
                                            - El contrato de compraventa. Características, requisitos y elementos del contrato.
                                            <br/>
                                            - Normas que regulan la compraventa: compraventa civil y mercantil.
                                            <br/>
                                            - La formación del contrato de compraventa: oferta y aceptación de la oferta.
                                            <br/>
                                            - Obligaciones de las partes: obligaciones del vendedor y del comprador.
                                            <br/>
                                            - Clausulado general de un contrato de compraventa.
                                            <br/>
                                            - El contrato de compraventa a plazos.
                                            <br/>
                                            - El contrato de suministro.
                                            <br/>
                                            - El contrato estimatorio o de ventas en consignación.
                                            <br/>
                                            - Contratos de compraventas especiales.
                                            <br/>
                                            - Los contratos de transporte y de seguro.
                                            <br/>
                                            - Los contratos de leasing y de renting.
                                            <br/>
                                            - Los contratos de factoring y de forfaiting.
                                            <br/>
                                            - Resolución de conflictos por incumplimiento del contrato: vía judicial y vía arbitral.
                                            <br/>
                                            Planificación de la gestión de las relaciones con clientes:
                                            <br/>
                                            - El seguimiento de la venta y la atención al cliente.
                                            <br/>
                                            - El servicio postventa.
                                            <br/>
                                            - Servicio de información y de atención al cliente, consumidor y usuario.
                                            <br/>
                                            - Normativa vigente en materia de protección del consumidor y usuario.
                                            <br/>
                                            - Gestión de quejas y reclamaciones de clientes.
                                            <br/>
                                            - Marketing relacional y de relación con los clientes.
                                            <br/>
                                            - Gestión de las relaciones con clientes.
                                            <br/>
                                            - Control de calidad del servicio de atención e información al cliente, consumidor o usuario.
                                            <br/>
                                            - Estrategias y técnicas de fidelización de clientes.
                                            <br/>
                                            - Programas de fidelización.
                                            <br/>
                                            - Aplicaciones informáticas de gestión de las relaciones con clientes (CRM).
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
                                                La formación del módulo contribuye a alcanzar los objetivos generales j), k), o), p), q), r), s), t), u), v), w) y x) del ciclo formativo, y las competencias g), l), m), n), ñ), o), p), q) y r) del título.
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
