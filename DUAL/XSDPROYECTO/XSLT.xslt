<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html" encoding="UTF-8" indent="yes"/>
    <!-- Plantilla principal -->
    <xsl:template match="/">
        <html>
            <head> 
                <title>Marketing y Publicidad</title>
            </head>
            <body>
                <table>
                    <tr>
                        <th>Modulos</th>
                    </tr>
                    <tr>
                        <td><xsl:value-of select="//Modulo/@Nombre"/></td>
                    </tr>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>