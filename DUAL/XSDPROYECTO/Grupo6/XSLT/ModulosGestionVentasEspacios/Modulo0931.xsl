<?xml version="1.0" encoding="UTF-8"?>


<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <xsl:template match="/">
        <xsl:variable name="codigoModulo" select="'0931'"></xsl:variable>
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
                                            Administración de los accesos y conexiones a redes:
                                            <br/>
                                            - Introducción. Qué es Internet y su origen.
                                            <br/>
                                            - Cómo funciona: servidores y clientes, el protocolo TCP/IP, la World Wide Web, los dominios de la red.
                                            <br/>
                                            - Modos de conectarse a Internet.
                                            <br/>
                                            - Configuración del acceso.
                                            <br/>
                                            - Las intranets y las extranets.
                                            <br/>
                                            - Qué es un navegador y cómo funciona: navegadores más utilizados.
                                            <br/>
                                            - Búsqueda de información en la red.
                                            <br/>
                                            - Los buscadores: motores de búsqueda e índices, buscadores temáticos, multibuscadores y metabuscadores.
                                            <br/>
                                            - Conceptos básicos de búsqueda con operadores, sintaxis especiales de búsqueda, la opción de búsqueda avanzada, inclusión en servicios adicionales y herramientas específicas.
                                            <br/>
                                            Gestión de diversos servicios y protocolos de Internet:
                                            <br/>
                                            - Correo electrónico: qué es y cómo funciona.
                                            <br/>
                                            - El correo web: crear una cuenta, realizar las funciones básicas de leer, responder y enviar.
                                            <br/>
                                            - Correo no deseado.
                                            <br/>
                                            - Correo POP3: qué es y cómo utilizarlo.
                                            <br/>
                                            - Gestionar las operaciones de envío, recepción y mantenimiento de correo POP3.
                                            <br/>
                                            - Transferencia de archivos: qué es y cómo utilizarla.
                                            <br/>
                                            - Servidores FTP. Aplicaciones FTP.
                                            <br/>
                                            - Redes P2P (peer to peer): aplicaciones.
                                            <br/>
                                            - Descargas: musicales, de vídeos y software.
                                            <br/>
                                            - Freeware y shareware.
                                            <br/>
                                            - Conexiones telefónicas de voz.
                                            <br/>
                                            Realización de la facturación electrónica y otras tareas administrativas de forma telemática:
                                            <br/>
                                            - Factura electrónica: aspectos generales, condiciones para su utilización y normativa legal.
                                            <br/>
                                            - Seguridad: firma electrónica reconocida.
                                            <br/>
                                            - Programas de facturación electrónica.
                                            <br/>
                                            - Relación con otras empresas y organismos públicos: banca electrónica, trámites con la Seguridad Social y relaciones tributarias con Hacienda entre otros.
                                            <br/>
                                            - Programas de visualización e impresión de archivos PDF.
                                            <br/>
                                            - Programas reproductores, organizadores y sincronizadores de música, vídeos, películas, programas de televisión y audiolibros, entre otras aplicaciones.
                                            <br/>
                                            - Seguridad en Internet: spam, virus informáticos, spyware y phising.
                                            <br/>
                                            - Los programas antivirus, cortafuegos y antiespías.
                                            <br/>
                                            Determinación de la estrategia que se ha de seguir en las interrelaciones con otros usuarios de la red:
                                            <br/>
                                            - Los grupos de conversación o chat: programas IRC y programas webchat.
                                            <br/>
                                            - Servicio de mensajería instantánea.
                                            <br/>
                                            - Telefonía por Internet.
                                            <br/>
                                            - Videoconferencia.
                                            <br/>
                                            - Los foros: leer y escribir en un foro.
                                            <br/>
                                            - Los grupos de discusión.
                                            <br/>
                                            - Redes sociales.
                                            <br/>
                                            - Weblogs, blogs o bitácoras.
                                            <br/>
                                            - Redes sociales para empresas.
                                            <br/>
                                            - Añadir elementos a una página de una red social.
                                            <br/>
                                            - Utilizar elementos fotográficos y audiovisuales en una página de una red social.
                                            <br/>
                                            - Añadir aplicaciones profesionales a una página.
                                            <br/>
                                            - Blog externos y RSS.
                                            <br/>
                                            - Cómo buscar un grupo interesante.
                                            <br/>
                                            - Crear una red de contactos influyentes.
                                            <br/>
                                            - Comprar y vender en redes sociales.
                                            <br/>
                                            Construcción de páginas web:
                                            <br/>
                                            - Estructura de una página web.
                                            <br/>
                                            - Lenguaje HTML.
                                            <br/>
                                            - Creación de páginas web con los editores web más usuales.
                                            <br/>
                                            - Elección del servidor para alojar páginas web.
                                            <br/>
                                            - Publicación de páginas web vía FTP.
                                            <br/>
                                            - Alta en buscadores.
                                            <br/>
                                            - Programas de diseño gráfico y otras utilidades para la web.
                                            <br/>
                                            - Catálogo online.
                                            <br/>
                                            - Flujos de caja y financiación de la tienda online.
                                            <br/>
                                            - Zonas calientes y zonas de usuario.
                                            <br/>
                                            - El carrito de la compra online.
                                            <br/>
                                            Diseño del plan de marketing digital:
                                            <br/>
                                            - Desarrollo del plan de marketing digital.
                                            <br/>
                                            - El comportamiento del cliente online.
                                            <br/>
                                            - Promoción online y offline de la web.
                                            <br/>
                                            - Herramientas de posicionamiento en buscadores: e-mail marketing, SEM, SEO y campañas en páginas afines.
                                            <br/>
                                            - Políticas de captación: proceso de creación de una marca.
                                            <br/>
                                            - Análisis de estadísticas y medición de resultados.
                                            <br/>
                                            - Marketing de afiliación.
                                            <br/>
                                            - Marketing relacional y gestión de la relación con los clientes (CRM).
                                            <br/>
                                            - Cross marketing.
                                            <br/>
                                            - Marketing viral.
                                            <br/>
                                            - Marketing one-to-one.
                                            <br/>
                                            - Aplicaciones del mobile marketing y TDT, entre otros.
                                            <br/>
                                            Definición de la política de comercio electrónico de una empresa:
                                            <br/>
                                            - Idea y diseño de una tienda virtual.
                                            <br/>
                                            - Modelos de negocio digital: portales horizontales, B2B y B2C, entre otros.
                                            <br/>
                                            - Selección y registro de dominio.
                                            <br/>
                                            - Escaparate web. Catálogo electrónico.
                                            <br/>
                                            - Control logístico de las mercancías vendidas online.
                                            <br/>
                                            - La reclamación como instrumento de fidelización del cliente.
                                            <br/>
                                            - La importancia financiera de la reclamación.
                                            <br/>
                                            - Medios de pago electrónicos.
                                            <br/>
                                            - Períodos de reflexión y cancelaciones.
                                            <br/>
                                            - Criptografía: clave simétrica, clave asimétrica y cifrado de clave única.
                                            <br/>
                                            - Firma.
                                            <br/>
                                            - Certificados digitales.
                                            <br/>
                                            - Encriptación.
                                            <br/>
                                            - Negocios electrónicos: e-shop, e-mail, e-procurement, e-marketplace y e-auction, entre otros.
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
                                                La formación del módulo contribuye a alcanzar los objetivos generales c), o), p), q), r), s), t), u), v), w) y x) del ciclo formativo, y las competencias c), l), m), n), ñ), o), p), q) y r) del título.
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
