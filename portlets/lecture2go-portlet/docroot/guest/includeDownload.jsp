<c:if test="${video.downloadLink==1}">
<p class="smallitalic">download-text</p>
<div id="down">
		<!-- openaccess start -->
			<div id="downloads">
				<c:if test="${video.mp4File.isFile()==true}">
					<div class="download">
						<a href="${video.mp4DownloadLink}" target="_blank"> <span class="icon-large icon-film"/><br/>mp4-video </a>
					</div>
				</c:if>
				<c:if test="${video.mp3File.isFile()==true}">
					<div class="download">
						<a href="${video.mp3DownloadLink}" target="_blank"> <span class="icon-large icon-music"/><br/>mp3-audion </a>
					</div>
				</c:if>

				<c:if test="${video.pdfFile.isFile()==true}">
					<div class="download">
						<a href="${video.pdfDownloadLink}" target="_blank"> <span class="icon-large icon-book"/><br/>pdf-text </a>
					</div>
				</c:if>
				
				<c:if test="${video.m4vFile.isFile()==true}">
					<div class="download">
						<a href="${video.m4vDownloadLink}" target="_blank"> <span class="icon-large icon-film"/><br/>m4v-video </a>
					</div>
				</c:if>

				<c:if test="${video.m4aFile.isFile()==true}">
					<div class="download">
						<a href="${video.m4aDownloadLink}" target="_blank"> <span class="icon-large icon-music"/><br/>m4a-audio </a>
					</div>
				</c:if>

				<c:if test="${video.oggFile.isFile()==true}">
					<div class="download">
						<a href="${video.oggDownloadLink}" target="_blank"> <span class="icon-large icon-film"/><br/>ogg-video </a>
					</div>
				</c:if>

				<c:if test="${video.webmFile.isFile()==true}">
					<div class="download">
						<a href="${video.webmDownloadLink}" target="_blank"> <span class="icon-large icon-film"/><br/>webm-video </a>
					</div>
				</c:if>

				<c:if test="${video.flvFile.isFile()==true}">
					<div class="download">
						<a href="${video.flvDownloadLink}" target="_blank"> <span class="icon-large icon-film"/><br/>flv-video </a>
					</div>
				</c:if>
			</div>
		<!-- openaccess end -->
</div>
</c:if>